/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.starturn.database.query.impl;

import com.starturn.database.entities.MemberProfile;
import com.starturn.database.entities.UserToken;
import com.starturn.database.query.MemberServiceQuery;
import com.starturn.database.util.HibernateDataAccess;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.query.Query;

/**
 *
 * @author Administrator
 */
public class MemberServiceQueryImpl implements MemberServiceQuery {

    private static final Logger logger = LogManager.getLogger(MemberServiceQueryImpl.class);

    @Override
    public boolean checkUserExists(String username) throws Exception {
        HibernateDataAccess dao = new HibernateDataAccess();
        Long count = 0L;
        try {
            dao.startOperation();
            CriteriaBuilder cb = dao.getSession().getCriteriaBuilder();
            CriteriaQuery<Long> cr = cb.createQuery(Long.class);

            Root<MemberProfile> root = cr.from(MemberProfile.class);
            cr.select(cb.count(root)).where(cb.equal(root.get("username"), username));

            Query<Long> query = dao.getSession().createQuery(cr);
            count = query.getSingleResult();

            dao.commit();
        } catch (Exception ex) {
            dao.rollback();
            logger.error("error thrown - ", ex);
            throw new Exception(ex);
        } finally {
            dao.closeSession();
        }
        return count > 0;
    }

    @Override
    public MemberProfile getUserInformation(String username) throws Exception {
        HibernateDataAccess dao = new HibernateDataAccess();
        MemberProfile profile = new MemberProfile();
        try {
            dao.startOperation();
            CriteriaBuilder cb = dao.getSession().getCriteriaBuilder();
            CriteriaQuery<MemberProfile> cr = cb.createQuery(MemberProfile.class);

            Root<MemberProfile> root = cr.from(MemberProfile.class);
            cr.select(root).where(cb.equal(root.get("username"), username));

            Query<MemberProfile> query = dao.getSession().createQuery(cr);
            profile = query.getSingleResult();

            dao.commit();
        } catch (Exception ex) {
            dao.rollback();
            logger.error("error thrown - ", ex);
            throw new Exception(ex);
        } finally {
            dao.closeSession();
        }
        return profile;
    }

    @Override
    public boolean checkPhoneNumberExists(String phoneNumber) throws Exception {
        HibernateDataAccess dao = new HibernateDataAccess();
        Long count = 0L;
        try {
            dao.startOperation();
            CriteriaBuilder cb = dao.getSession().getCriteriaBuilder();
            CriteriaQuery<Long> cr = cb.createQuery(Long.class);

            Root<MemberProfile> root = cr.from(MemberProfile.class);
            cr.select(cb.count(root)).where(cb.equal(root.get("phoneNumber"), phoneNumber));

            Query<Long> query = dao.getSession().createQuery(cr);
            count = query.getSingleResult();

            dao.commit();
        } catch (Exception ex) {
            dao.rollback();
            logger.error("error thrown - ", ex);
            throw new Exception(ex);
        } finally {
            dao.closeSession();
        }
        return count > 0;
    }

    @Override
    public boolean userSignUp(MemberProfile profile, UserToken token) throws Exception {
        HibernateDataAccess dao = new HibernateDataAccess();
        boolean saved = false;
        try {
            dao.startOperation();

            dao.createUpdateObject(profile);

            token.setMemberProfile(profile);
            dao.createUpdateObject(token);

            dao.commit();
            saved = true;
        } catch (Exception ex) {
            dao.rollback();
            logger.error("error thrown - ", ex);
            throw new Exception(ex);
        } finally {
            dao.closeSession();
        }
        return saved;
    }

    @Override
    public boolean checkTokenExists(String token) throws Exception {
        HibernateDataAccess dao = new HibernateDataAccess();
        Long count = 0L;
        try {
            dao.startOperation();
            CriteriaBuilder cb = dao.getSession().getCriteriaBuilder();
            CriteriaQuery<Long> cr = cb.createQuery(Long.class);

            Root<UserToken> root = cr.from(UserToken.class);
            cr.select(cb.count(root)).where(cb.equal(root.get("token"), token));

            Query<Long> query = dao.getSession().createQuery(cr);
            count = query.getSingleResult();

            dao.commit();
        } catch (Exception ex) {
            dao.rollback();
            logger.error("error thrown - ", ex);
            throw new Exception(ex);
        } finally {
            dao.closeSession();
        }
        return count > 0;
    }

    @Override
    public UserToken retrieveToken(String token) throws Exception {
       HibernateDataAccess dao = new HibernateDataAccess();
        UserToken profile = new UserToken();
        try {
            dao.startOperation();
            CriteriaBuilder cb = dao.getSession().getCriteriaBuilder();
            CriteriaQuery<UserToken> cr = cb.createQuery(UserToken.class);

            Root<UserToken> root = cr.from(UserToken.class);
            cr.select(root).where(cb.equal(root.get("token"), token));

            Query<UserToken> query = dao.getSession().createQuery(cr);
            profile = query.getSingleResult();

            dao.commit();
        } catch (Exception ex) {
            dao.rollback();
            logger.error("error thrown - ", ex);
            throw new Exception(ex);
        } finally {
            dao.closeSession();
        }
        return profile;
    }
}
