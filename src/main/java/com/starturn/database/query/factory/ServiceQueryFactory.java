/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.starturn.database.query.factory;

import com.starturn.database.query.DaoServiceQuery;
import com.starturn.database.query.MemberServiceQuery;
import com.starturn.database.query.impl.DaoServiceQueryImpl;
import com.starturn.database.query.impl.MemberServiceQueryImpl;

/**
 *
 * @author Administrator
 */
public class ServiceQueryFactory {

    public static DaoServiceQuery getDaoServiceQuery() {
        return new DaoServiceQueryImpl();
    }

    public static MemberServiceQuery getMemberServiceQuery() {
        return new MemberServiceQueryImpl();
    }
}
