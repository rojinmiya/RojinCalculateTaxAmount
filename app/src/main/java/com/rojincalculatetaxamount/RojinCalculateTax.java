package com.rojincalculatetaxamount;

public class RojinCalculateTax {
    private float rojin_totalsalary, rojin_totalTax, tax1, tax2, tax3;

    public RojinCalculateTax(float rojin_salary) {
        this.rojin_totalsalary = rojin_salary * 12;
    }

    public float getRojin_totalsalary() {
        return rojin_totalsalary;
    }

    public void setRojin_totalsalary(float rojin_totalsalary) {
        this.rojin_totalsalary = rojin_totalsalary;
    }

    public float getRojin_totalTax() {
        return rojin_totalTax;
    }

    public void setRojin_totalTax(float rojin_totalTax) {
        this.rojin_totalTax = rojin_totalTax;
    }

    public float calculateTax() {
        if (rojin_totalsalary <= 200000) {
            tax1 = rojin_totalsalary / 100;
            return tax1;

        } else if (rojin_totalsalary >= 200000 && rojin_totalsalary <= 350000) {
            tax1 = (200000 * 1) / 100;
            rojin_totalsalary = rojin_totalsalary - 200000;
            tax2 = (rojin_totalsalary * 15) / 100;
            return tax1 + tax2;
        } else if (rojin_totalsalary >= 350000) {
            tax1 = (200000 * 1) / 100;
            rojin_totalsalary = rojin_totalsalary - 200000;
            tax2 = (150000 * 15) / 100;
            rojin_totalsalary = rojin_totalsalary - 150000;
            tax3 = (rojin_totalsalary * 25) / 100;
            return tax1 + tax2 + tax3;

        }
        return 0;

    }

}
