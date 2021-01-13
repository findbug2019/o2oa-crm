package com.x.wcrm.assemble.control.jaxrs.customer.pool;

import com.x.base.core.container.EntityManagerContainer;
import com.x.base.core.container.factory.EntityManagerContainerFactory;
import com.x.base.core.entity.JpaObject;
import com.x.base.core.project.bean.WrapCopier;
import com.x.base.core.project.bean.WrapCopierFactory;
import com.x.base.core.project.exception.ExceptionEntityNotExist;
import com.x.base.core.project.http.ActionResult;
import com.x.base.core.project.http.EffectivePerson;
import com.x.wcrm.assemble.control.jaxrs.customer.BaseAction;
import com.x.wcrm.assemble.control.wrapout.WrapOutCustomer;
import com.x.wcrm.core.entity.Customer;

class ActionGet extends BaseAction {

	ActionResult<Wo> execute(EffectivePerson effectivePerson, String id) throws Exception {
		try (EntityManagerContainer emc = EntityManagerContainerFactory.instance().create()) {
			ActionResult<Wo> result = new ActionResult<>();
			//			Business business = new Business(emc);
			Customer o = emc.find(id, Customer.class);
			if (null == o) {
				throw new ExceptionEntityNotExist(id, Customer.class);
			}
			Wo wo = Wo.copier.copy(o);
			// 客户关联联系人。
			// 客户的跟进记录。
			result.setData(wo);
			return result;
		}

	}

	public static class Wo extends WrapOutCustomer {
		/**
		 * 
		 */
		private static final long serialVersionUID = 3737726852892756455L;
		//public static WrapCopier<Customer, Wo> copier = WrapCopierFactory.wo(Customer.class, Wo.class, null, null, false);
		static WrapCopier<Customer, Wo> copier = WrapCopierFactory.wo(Customer.class, Wo.class, null, JpaObject.FieldsInvisible, false);
	}
}
