package interface01;

public  class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void Add() {
        System.out.println("My Sql e eklendi");

    }
}
