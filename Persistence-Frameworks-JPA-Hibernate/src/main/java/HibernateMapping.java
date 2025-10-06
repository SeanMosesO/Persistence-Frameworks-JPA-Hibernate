<?xml version="1.0"?>
<!DOCTYPE hibernate-mapping PUBLIC
        "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
        "http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd">

<hibernate-mapping package="org.hibernate.persistenceframeworksjpahibernate.domain">

    <class name="Event" table="EVENT">
        <id name="id" column="EVENT_ID">
            <generator class="native"/>
        </id>
        <property name="title" column="TITLE"/>
        <property name="date" column="EVENT_DATE"/>
    </class>
    <class name="Person" table="PERSON">
        <id name="id" column="PERSON_ID">
            <generator class="native"/>
        </id>
        <property name="firstname" column="FIRSTNAME"/>
        <property name="lastname" column="LASTNAME"/>
        <property name="age" column="AGE"/>
        
<set name="emailAddresses" table="PERSON_EMAIL_ADDR">
            <key column="PERSON_ID"/>
            <element type="string" column="EMAIL_ADDR"/>
        </set>

</hibernate-mapping>