public class Company {

    private String companyId;

    private SalesPerson[] salesPersons;

    public Company(String companyId, SalesPerson[] salesPersons) {
        this.companyId = companyId;
        this.salesPersons = salesPersons;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public SalesPerson[] getSalesPersons() {
        return salesPersons;
    }

    public void setSalesPersons(SalesPerson[] salesPersons) {
        this.salesPersons = salesPersons;
    }

    public double getHighestSale() {

        double highestSale = 0.0;

        for (int i = 0; i < getSalesPersons().length; i++) {

            SalesPerson person = getSalesPersons()[i];
            if(person !=null) {
                for (int j = 0; j < person.getSalesHistory().length; j++) {
                    if (person.getSalesHistory()[j] != null) {
                        if (person.getSalesHistory()[j].getValue() > highestSale) {
                            highestSale = person.getSalesHistory()[j].getValue();
                        }
                    }

                }
            }

        }
        return highestSale;
    }


}
