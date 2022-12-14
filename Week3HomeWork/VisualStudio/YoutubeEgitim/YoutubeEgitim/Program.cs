using System;

namespace YoutubeEgitim
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
            int sayi1 = 10;
            int sayi2 = 20;
            sayi1= sayi2;
            sayi1 = sayi2;

            Console.WriteLine(sayi1); 
            */

            /*
             int[] sayilar1 = new[] { 1, 2, 3 };
             int[] sayilar2 = new[] { 10, 20, 30 };

             sayilar1 = sayilar2;

             sayilar2[0] = 1000;

             Console.WriteLine(sayilar1[0]);
            */
            /*
             CreditManager creditManager = new CreditManager();
             creditManager.Calculate();
             creditManager.Calculate();
             creditManager.Save();

             Customer customer = new Customer();
             customer.Id = 1;
             customer.City = "Ankara";



             CustomerManager customerManager = new CustomerManager(customer);
             customerManager.Save();
             customerManager.Delete();

             Company company = new Company();
             company.TaxNumber = "10000";
             company.CompanyName = "Arçelik";
             company.Id = 100;

             CustomerManager customerManager2 = new CustomerManager(new Person());


             Person person = new Person();
             person.NationalIdentify = "Türk";

             Customer c1 = new Customer();
             Customer c2 = new Person();
             Customer c3 = new Company();
            */

            //IoC Container

            CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
            customerManager.GiveCredit();



            Console.ReadLine();

        }
    }
    class CreditManager
    {
        public void Calculate(int creditType)
        {
            if (creditType == 1)//esnaf
            {

            }
            if (creditType == 2)//ogretmen
            {

            }

            Console.WriteLine("Hesaplandı");

        }
        public void Save()
        {
            Console.WriteLine("Kredi Verildi");
        }
    }

    class Customer
    {
        public int Id { get; set; }
        public string City { get; set; }
    }

    class Person: Customer
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string NationalIdentify { get; set; }

    }

    class Company: Customer
    {
        public string CompanyName { get; set; }
        public string TaxNumber { get; set; }
    }

    class CustomerManager
    {
        private Customer _customer;
        private ICreditManager _creditManager;
        public CustomerManager(Customer customer, ICreditManager creditManager)
        {
            _customer = customer;
            _creditManager = creditManager;
        }
        public void Save()
        {
            Console.WriteLine("Müşteri kaydedildi: ");
        }
        public void Delete()
        {
            Console.WriteLine("Müşteri silindi: ");
        }
        
        public void GiveCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("Kredi verildi");
        }
    }
    interface ICreditManager
    {
        void Calculate();
        void Save();
    }
    class TeacherCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Öğretmen Kredisi Hesaplandı");
        }
        public override void Save()
        {
            base.Save();
        }
    }
    class MilitaryCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Asker Kredisi Hesaplandı");
        }

        public void Save()
        {
            throw new NotImplementedException();
        }
       
    }
    class CarCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Araba Kredisi Hesaplandı");
        }

        public void Save()
        {
            throw new NotImplementedException();
        }

    }
    abstract class BaseCreditManager : ICreditManager
    {
        public abstract void Calculate();

        public virtual void Save()
        {
            Console.WriteLine("Kaydedildi");
        }
    }
}