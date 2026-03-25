package com.week5.assignment.dao;

import com.week5.assignment.entity.Staff;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StaffDao {
    @Autowired
    SessionFactory sessionFactory;

    public List<Staff> getStaff(){
        List<Staff> list = null;
        Session session = sessionFactory.openSession();
        try{
            list = session.createQuery("from Staff", Staff.class).list();
        }catch (Exception e){
            //handling code
        }finally {
            session.close();
        }
        return list;
    }


    public Staff getStaffMemberById(int staffid) {
        Staff staff = null;
        Session session = sessionFactory.openSession();
        try{
            staff = session.find(Staff.class, staffid);
        }catch (Exception e){
            //handling code
        }finally {
            session.close();
        }
        return staff;

    }

    public void insertOneStaffMember(Staff staff) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Transaction transaction1 = session.beginTransaction();
        try{
            session.persist(staff);
            transaction.commit();
        }catch (Exception e){
            //handling code
        }finally {
            session.close();
        }
    }

    public List<Staff> getStaffMemberSalaryMoreThanGivenAmount(double salary) {
        Session session = sessionFactory.openSession();
        List<Staff> list = null;
        try{
            list = session.createQuery("from Staff s where s.salary>:salary", Staff.class)
                    .setParameter("salary", salary)
                    .getResultList();
        }catch (Exception e){
            //handling code
        }finally {
            session.close();
        }
        return list;
    }

    public List<Staff> getStaffMemberByExperience(int minExperience, int maxExperience) {
        Session session = sessionFactory.openSession();
        List<Staff> list = null;
        try{
            list = session.createQuery("from Staff s where s.experience>=:minExperience and s.experience<=:maxExperience", Staff.class)
                    .setParameter("minExperience", minExperience)
                    .setParameter("maxExperience", maxExperience)
                    .getResultList();
        }catch (Exception e){
            //Handling code
        }finally {
            session.close();
        }
        return list;
    }

    public Staff getStaffMemberByMaxSalary() {
        Session session = sessionFactory.openSession();
        Staff staff = null;
        try{
            staff = session.createQuery("from Staff s1 where s1.salary=(select max(s2.salary) from Staff s2)", Staff.class).uniqueResult();
        }catch(Exception e){
            //handling code
        }finally{

        }
        return staff;
    }

    public void setSalaryForId(int id, double salary) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try{
            Staff staff = session.find(Staff.class, id);
            staff.setSalary(salary);
            session.persist(staff);
            transaction.commit();
        }catch (Exception e){
            //handling code
            transaction.rollback();
        }finally {
            session.close();
        }
    }

    public String getStaffNameWithMinExperience() {
        Session session = sessionFactory.openSession();
        Staff staff = null;
        try{
            staff = session.createQuery("from Staff s1 where s1.experience=(select min(s2.experience) from Staff s2)", Staff.class).uniqueResult();
        }catch (Exception e){
            //Handling code
        }finally {
            session.close();
        }
        return staff.getName();
    }

    public List<Staff> getAllTrainers() {
        Session session = sessionFactory.openSession();
        List<Staff> list = null;
        try{
            list = session.createQuery("from Staff s where s.profile=:profile", Staff.class).setParameter("profile", "Trainer").getResultList();
        }catch(Exception e){
            //Handling code
        }finally {
            session.close();
        }
        return list;
    }

    public List<Staff> getNoneTrainers() {
        Session session = sessionFactory.openSession();
        List<Staff> list = null;
        try{
            list = session.createQuery("from Staff s where not s.profile=:profile", Staff.class).setParameter("profile", "Trainer").getResultList();
        }catch(Exception e){
            //Handling code
        }finally {
            session.close();
        }
        return list;
    }
}
