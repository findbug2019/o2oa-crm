/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.wcrm.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.wcrm.core.entity.Opportunity.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Wed Jan 13 10:47:31 CST 2021")
public class Opportunity_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Opportunity,String> createuser;
    public static volatile SingularAttribute<Opportunity,String> customerid;
    public static volatile SingularAttribute<Opportunity,Date> dealdate;
    public static volatile SingularAttribute<Opportunity,Integer> discountrate;
    public static volatile SingularAttribute<Opportunity,String> follow;
    public static volatile SingularAttribute<Opportunity,String> id;
    public static volatile SingularAttribute<Opportunity,String> isend;
    public static volatile SingularAttribute<Opportunity,Integer> money;
    public static volatile SingularAttribute<Opportunity,Date> nexttime;
    public static volatile SingularAttribute<Opportunity,String> opportunityname;
    public static volatile SingularAttribute<Opportunity,String> owneruser;
    public static volatile SingularAttribute<Opportunity,String> pinyin;
    public static volatile SingularAttribute<Opportunity,String> pinyinInitial;
    public static volatile ListAttribute<Opportunity,String> readerUserIds;
    public static volatile SingularAttribute<Opportunity,String> remark;
    public static volatile SingularAttribute<Opportunity,String> statusid;
    public static volatile SingularAttribute<Opportunity,String> statustime;
    public static volatile SingularAttribute<Opportunity,Integer> totalprice;
    public static volatile SingularAttribute<Opportunity,String> typeid;
    public static volatile ListAttribute<Opportunity,String> writerUserIds;
}
