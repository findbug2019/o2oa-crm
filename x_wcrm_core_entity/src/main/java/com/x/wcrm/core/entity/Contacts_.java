/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.wcrm.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.wcrm.core.entity.Contacts.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Wed Jan 13 10:47:31 CST 2021")
public class Contacts_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Contacts,String> cellphone;
    public static volatile SingularAttribute<Contacts,String> contactsname;
    public static volatile SingularAttribute<Contacts,String> createuser;
    public static volatile SingularAttribute<Contacts,String> customerid;
    public static volatile SingularAttribute<Contacts,String> decision;
    public static volatile SingularAttribute<Contacts,String> detailaddress;
    public static volatile SingularAttribute<Contacts,String> email;
    public static volatile SingularAttribute<Contacts,String> follow;
    public static volatile SingularAttribute<Contacts,String> id;
    public static volatile SingularAttribute<Contacts,Date> nexttime;
    public static volatile SingularAttribute<Contacts,String> owneruser;
    public static volatile SingularAttribute<Contacts,String> pinyin;
    public static volatile SingularAttribute<Contacts,String> pinyinInitial;
    public static volatile SingularAttribute<Contacts,String> post;
    public static volatile SingularAttribute<Contacts,String> province;
    public static volatile ListAttribute<Contacts,String> readerUserIds;
    public static volatile SingularAttribute<Contacts,String> remark;
    public static volatile SingularAttribute<Contacts,String> sex;
    public static volatile SingularAttribute<Contacts,String> telephone;
    public static volatile ListAttribute<Contacts,String> writerUserIds;
}
