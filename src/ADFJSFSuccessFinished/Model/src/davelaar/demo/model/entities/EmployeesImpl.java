/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package davelaar.demo.model.entities;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Nov 13 15:01:02 CET 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeesImpl
  extends EntityImpl
{
  private static EntityDefImpl mDefinitionObject;

  /**
   * This is the default constructor (do not remove).
   */
  public EmployeesImpl()
  {
  }

  /**
   * @param employeeId key constituent

   * @return a Key object based on given key constituents.
   */
  public static Key createPrimaryKey(Number employeeId)
  {
    return new Key(new Object[]{employeeId});
  }

  /**
   * @return the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    if (mDefinitionObject == null)
    {
      mDefinitionObject = EntityDefImpl.findDefObject("davelaar.demo.model.entities.Employees");
    }
    return mDefinitionObject;
  }

  /**
   * Add attribute defaulting logic in this method.
   * @param attributeList list of attribute names/values to initialize the row
   */
  protected void create(AttributeList attributeList)
  {
    super.create(attributeList);
//    this.get
//    getDBTransaction().getRootApplicationModule().findViewObject("EmployeesView1").getR
  }
}