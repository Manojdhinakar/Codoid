 class Office{
    String strName="Maddy";
    public void testMethod(String strName){
        System.out.println("Value:"+strName);
            this.strName=strName;
            System.out.println(this.strName);

    }
    public static void main(String args[]){
        Office obj=new Office();
        obj.testMethod("QA");
    }
}
