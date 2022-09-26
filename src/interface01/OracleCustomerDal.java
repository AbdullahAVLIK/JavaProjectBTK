package interface01;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void Add() {
        System.out.println("Oracle e eklendi");
    }
}
