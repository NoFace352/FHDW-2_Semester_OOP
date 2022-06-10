package de.fhdw.auebung.composite;

import de.fhdw.auebung.composite.Leafs.FinancielDepartment;
import de.fhdw.auebung.composite.Leafs.SalesDepartment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeadDepartmentTest {

    @Test
    void test(){
        Department salesDepartment = new SalesDepartment(
                1, "Sales department");
        Department financialDepartment = new FinancielDepartment(
                2, "Financial department");

        HeadDepartment headDepartment = new HeadDepartment(
                3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();
    }
}