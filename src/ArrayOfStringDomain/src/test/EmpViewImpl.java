/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import oracle.jbo.server.ViewObjectImpl;
import oracle.sql.ArrayDescriptor;
import oracle.jbo.domain.Array;
import java.sql.*;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------

public class EmpViewImpl extends ViewObjectImpl implements test.common.EmpView  {

  private ArrayDescriptor descriptor;
  
  /**
   * This is the default constructor (do not remove)
   */
  public EmpViewImpl() {
  }

  public void setNamesToFind(String[] names) {
    Array arr = null;
    try {
      Connection conn = getCurrentConnection();
      if (descriptor == null) {
        setupDescriptor(conn);
      }
      arr = new Array(descriptor,conn,names);
    }
    catch (SQLException s) {
      s.printStackTrace();
    }
    if (arr != null)  setWhereClauseParam(0,arr);
  }
  private synchronized void setupDescriptor(Connection conn) throws SQLException {
    descriptor = new ArrayDescriptor("TABLE_OF_VARCHAR",conn);
  }
  private Connection getCurrentConnection() throws SQLException {
    PreparedStatement st = getDBTransaction().createPreparedStatement("commit",1);
    Connection conn = st.getConnection();
    st.close();
    return conn;
  }
}