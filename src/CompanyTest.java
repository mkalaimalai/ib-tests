public class CompanyTest {

    public static void main(String[] args) {
        // Company
        SalesPerson[] salesPeople = new SalesPerson[6];
        salesPeople[0] = new SalesPerson("100");
        salesPeople[1] = new SalesPerson("101");
        salesPeople[2] = new SalesPerson("102");

        salesPeople[0].setSalesHistory(new Sales("A100", 300.00, 10));
        salesPeople[0].setSalesHistory(new Sales("A200", 1000.00, 2));
        salesPeople[1].setSalesHistory(new Sales("A300", 2550.40, 10));
        salesPeople[2].setSalesHistory(new Sales("A400", 550.40, 8));
        salesPeople[2].setSalesHistory(new Sales("A500", 650.40, 8));


        Company apple = new Company("101", salesPeople);
        apple.setSalesPersons(salesPeople);


        System.out.println("Company ID-->" + apple.getCompanyId());

        for (int i = 0; i < apple.getSalesPersons().length; i++) {

            SalesPerson person = apple.getSalesPersons()[i];
            if (person != null) {
                System.out.println("Person -->" + person);

                System.out.println("Total Sales-->" + person.calcTotalSales());
                System.out.println("Get Highest Sale-->" + apple.getHighestSale());
            }

        }


    }


}
