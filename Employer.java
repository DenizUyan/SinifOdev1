public class Employer {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double vergi;
    int bonusMaas,bonusMaasSaati;
    double zam;
    double vergiBonus = this.salary+bonusMaas-vergi;
    double sonMaas = this.salary+zam;

    public Employer(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){

        if(this.salary<1000){
            vergi = 0;
        } else {
            vergi = this.salary * 0.03;
        }
        return vergi;
    }
    public double bonus(){

        if(this.workHours>40){
            bonusMaasSaati = this.workHours - 40;
            bonusMaas = bonusMaasSaati * 30;
        } return bonusMaas;
    }
    public double raiseSalary(){

        if(2021-this.hireYear<10){
            zam = this.salary * 0.05;
        }
        else if(2021-this.salary>9 && 2021-this.salary<20){
            zam = this.salary * 0.1;
        }
        else{
            zam = this.salary * 0.15;
        }
        return zam;
    }
    public String toString(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("Başlangıç Yılı: "+this.hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş Artışı: "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş : "+(this.salary-tax()+bonus()));
        System.out.println("Toplam Maaş: "+(this.salary+raiseSalary()));
        return null;
    }
}
