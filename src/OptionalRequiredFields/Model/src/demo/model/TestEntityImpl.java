/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package demo.model;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TestEntityImpl extends EntityImpl {
    public static final int ID = 0;
    public static final int ROWTYPE = 1;
    public static final int VALUEA = 2;
    public static final int VALUEB = 3;
    private static EntityDefImpl mDefinitionObject;

    /**This is the default constructor (do not remove)
     */
    public TestEntityImpl() {
    }


    /**Retrieves the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = (EntityDefImpl)EntityDefImpl.findDefObject("demo.model.TestEntity");
        }
        return mDefinitionObject;
    }

    /**Gets the attribute value for Id, using the alias name Id
     */
    public Number getId() {
        return (Number)getAttributeInternal(ID);
    }

    /**Sets <code>value</code> as the attribute value for Id
     */
    public void setId(Number value) {
        setAttributeInternal(ID, value);
    }

    /**Gets the attribute value for RowType, using the alias name RowType
     */
    public String getRowType() {
        return (String)getAttributeInternal(ROWTYPE);
    }

    /**Sets <code>value</code> as the attribute value for RowType
     */
    public void setRowType(String value) {
        setAttributeInternal(ROWTYPE, value);
        if (value !=null) {
            if (value.equalsIgnoreCase("A")) {
                setValueB(null);
            }
            else if (value.equalsIgnoreCase("B")) {
                setValueA(null);
            }

        }
    }

    /**Gets the attribute value for ValueA, using the alias name ValueA
     */
    public String getValueA() {
        return (String)getAttributeInternal(VALUEA);
    }

    /**Sets <code>value</code> as the attribute value for ValueA
     */
    public void setValueA(String value) {
        setAttributeInternal(VALUEA, value);
    }

    /**Gets the attribute value for ValueB, using the alias name ValueB
     */
    public String getValueB() {
        return (String)getAttributeInternal(VALUEB);
    }

    /**Sets <code>value</code> as the attribute value for ValueB
     */
    public void setValueB(String value) {
        setAttributeInternal(VALUEB, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case ID:
            return getId();
        case ROWTYPE:
            return getRowType();
        case VALUEA:
            return getValueA();
        case VALUEB:
            return getValueB();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case ID:
            setId((Number)value);
            return;
        case ROWTYPE:
            setRowType((String)value);
            return;
        case VALUEA:
            setValueA((String)value);
            return;
        case VALUEB:
            setValueB((String)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }

    /**Validation method for TestEntity
     */
    public boolean validateATypeHasAValue() {
        if (getRowType().equalsIgnoreCase("A")) {
            if ( (getValueA() == null || getValueA().equalsIgnoreCase(""))
                 ||
                 (getValueB() != null && !getValueB().equalsIgnoreCase(""))
            ){
                return false;
            }
        }
        return true;
    }

    /**Validation method for TestEntity
     */
    public boolean validateBTypeHasBValue() {
        if (getRowType().equalsIgnoreCase("B")) {
            if ( (getValueB() == null || getValueB().equalsIgnoreCase(""))
                 ||
                 (getValueA() != null && !getValueA().equalsIgnoreCase(""))
            ){
                return false;
            }
        }
        return true;
    }

    /**Creates a Key object based on given key constituents
     */
    public static Key createPrimaryKey(Number id) {
        return new Key(new Object[]{id});
    }
}
