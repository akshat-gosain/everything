public class Driver 
{
    public static void main(String[] args) 
    {
        System.out.println("\n\nHello! Welcome to OOP Lab 8 : Interfaces\n");
        System.out.println("At the end of this lab, zip all your files and upload it on Quanta and ensure that you have uploaded all the files.\n\n");

// ---------------------------------------------------------------------------------

        // Uncomment the following after completing the Book class

        Book book1 = new Book("Book 1", 100, "ABC");
        Book book2 = new Book("Book 2", 50, "XYZ");
        if(book1.getTitle() != "Book 1" || book2.getTitle() != "Book 2")
        {
            System.out.println("getTitle() is Wrong");
            return;
        }
        if(book1.getAuthor() != "ABC" || book2.getAuthor() != "XYZ")
        {
            System.out.println("getAuthor() is Wrong");
            return;
        }
        if(book1.getCost() != 100 || book2.getCost() != 50)
        {
            System.out.println("getCost() is Wrong");
            return;
        }
        Integer int1 = 5;
        Object ob1 = new Object();
        Book book1copy = new Book("Book 1", 100, "ABC");
        Book book1copydiffcost = new Book("Book 1", 50, "ABC");
        if(book2.equals(book1) || book1.equals(int1) || book2.equals(ob1) || !book1.equals(book1copy) || !book1.equals(book1copydiffcost))
        {
            System.out.println("equals is Wrong");
            return;
        }
        if(book1.compareTo(book1copy) != 0 || book1.compareTo(book1copydiffcost) != 1 || book2.compareTo(book1) != -1)
        {
            System.out.println("compareTo() is Wrong");
            return;
        }
        System.out.println("Book is correct, Proceed to the Kid class\n");



// ---------------------------------------------------------------------------------

        // Uncomment the following after completing the Kid class

        Kid kid1 = new Kid();

        if(kid1.getBooks().length != 0)
        {
            System.out.println("Initial Array size should be zero");
            return;
        }
        kid1.addBook(book1);
        kid1.addBook(book2);
        if(kid1.getBooks().length != 2 || !kid1.getBooks()[0].equals(book1) || !kid1.getBooks()[1].equals(book2))
        {
            System.out.println("addBook() is Wrong");
            return;
        }
        System.out.println("Kid is correct, Proceed to the BookStore class\n");



// ---------------------------------------------------------------------------------

        // Uncomment the following after completing the BookStore, NGO, PrivilegedKid and UnderprivilegedKid classes

        BookStore bs1 = new BookStore();
        Book bs1book1 = new Book("bs1book1", 150, "Shanay");
        Book bs1book2 = new Book("bs1book2", 100, "Sehaj");
        Book bs1book3 = new Book("bs1book3", 200, "Joel");
        bs1.addBook(bs1book1);
        boolean abbs = true;
        boolean gicbs = true;
        boolean done = true;
        if(bs1.getBooks().length != 1 || !bs1.getBooks()[0].equals(bs1book1))
        {
            //System.out.println("addBook() in BookStore is Wrong");
            abbs = false;
        }
        if(bs1.getItemCount() != 1)
        {
            //System.out.println("getItemCount() in BookStore is Wrong");
            gicbs = false;
        }
        bs1.addBook(bs1book2);
        if(bs1.getBooks().length != 2 || !bs1.getBooks()[0].equals(bs1book2) || !bs1.getBooks()[1].equals(bs1book1))
        {
            //System.out.println("addBook() in BookStore is Wrong");
            abbs = false;
        }
        if(bs1.getItemCount() != 2)
        {
            //System.out.println("getItemCount() in BookStore is Wrong");
            gicbs = false;
        }
        bs1.addBook(bs1book3);
        if(bs1.getBooks().length != 3 || !bs1.getBooks()[0].equals(bs1book2) || !bs1.getBooks()[1].equals(bs1book1) || !bs1.getBooks()[2].equals(bs1book3))
        {
            //System.out.println("addBook() in BookStore is Wrong");
            abbs = false;
        }
        if(bs1.getItemCount() != 3)
        {
            // System.out.println("getItemCount() in BookStore is Wrong");
            gicbs = false;
        }
        if(!abbs)
        {
            System.out.println("addBook() in BookStore is Wrong");
            done = false;
        }
        if(!gicbs)
        {
            System.out.println("getItemCount() in BookStore is Wrong");
            done = false;
        }

                             






        NGO ngo1 = new NGO(200);
        NGO ngo2 = new NGO(0);

        ngo2.receiveMoney(250);
        ngo1.receiveMoney(300);
        if(ngo1.getBudget() != 500 || ngo2.getBudget() != 250)
        {
            System.out.println("receiveMoney() in NGO is Wrong");
            done = false;
        }
        Book ngo1book1 = new Book("ngo1book1", 400, "Vidhi");
        Book ngo2book1 = new Book("ngo2book1", 251, "Vidhan");
        Book ngo1book2 = new Book("ngo1book2", 20, "Sehaj");
        Book ngo1book3 = new Book("ngo1book3", 80, "Ashman");
        ngo1.addBook(ngo1book1);
        ngo2.addBook(ngo2book1);
        boolean abngo = true;
        if(ngo1.getBooks().length != 1 || ngo1.getItemCount() != 1 || ngo1.getBudget() != 100 || !ngo1.getBooks()[0].equals(ngo1book1) || ngo2.getBooks().length != 0 || ngo2.getItemCount() != 0 || ngo2.getBudget() != 250)
        {
            // System.out.println("addBook() in NGO is Wrong");
            abngo = false;
        }
        ngo1.addBook(ngo1book2);
        if(ngo1.getBooks().length != 2 || ngo1.getItemCount() != 2 || ngo1.getBudget() != 80 || !ngo1.getBooks()[0].equals(ngo1book2) || !ngo1.getBooks()[1].equals(ngo1book1))
        {
            // System.out.println("addBook() in NGO is Wrong");
            abngo = false;
        }
        ngo1.addBook(ngo1book3);
        if(ngo1.getBooks().length != 3 || ngo1.getItemCount() != 3 || ngo1.getBudget() != 0 || !ngo1.getBooks()[0].equals(ngo1book2) || !ngo1.getBooks()[1].equals(ngo1book3) || !ngo1.getBooks()[2].equals(ngo1book1))
        {
            // System.out.println("addBook() in NGO is Wrong");
            abngo = false;
        }


        if(!abngo)
        {
            System.out.println("addBook() in NGO is Wrong");
            done = false;
        }
        





        PrivilegedKid pk1 = new PrivilegedKid(500);
        PrivilegedKid pk2 = new PrivilegedKid(1000);
        pk1.deductMoney(100);
        pk2.deductMoney(1001);
        if(pk1.getMoney() != 400 || pk2.getMoney() != 1000)
        {
            System.out.println("deductMoney() in PrivilegedKid is Wrong");
            done = false;
        }

        NGO ngo3 = new NGO(0);
        pk2.donateMoney(ngo3, 1001);
        boolean dmpk = false;
        if(pk2.getMoney() != 1000 || ngo3.getBudget() != 0)
        {
            //System.out.println("donateMoney() in PrivilegedKid is Wrong");
            dmpk = true;
        }
        pk2.donateMoney(ngo3, 200);
        if(pk2.getMoney() != 800 || ngo3.getBudget() != 200)
        {
           // System.out.println("donateMoney() in PrivilegedKid is Wrong");
           dmpk = true;
        }
        if(dmpk)
        {
            System.out.println("donateMoney() in PrivilegedKid is Wrong");
            done = false;
        }











        UnderprivilegedKid uk1 = new UnderprivilegedKid();
        boolean cgbbs = false;
        if(bs1.canGetBook(uk1, ngo1book3))
        {
            //System.out.println("canGetBook() in BookStore is Wrong");
            cgbbs = true;
        }
        PrivilegedKid pkbs1 = new PrivilegedKid(149);
        bs1.displayItems();
        if(bs1.canGetBook(pkbs1, bs1book1))
        {
            //System.out.println("canGetBook() in BookStore is Wrong");
            cgbbs = true;
        }
        PrivilegedKid pkbs2 = new PrivilegedKid(150);
        if(!bs1.canGetBook(pkbs2, bs1book1))
        {
            //System.out.println("canGetBook() in BookStore is Wrong");
            cgbbs = true;
        }
        if(bs1.getBooks().length != 2 || bs1.getIncome() != 150 || !bs1.getBooks()[0].equals(bs1book2) || !bs1.getBooks()[1].equals(bs1book3))
        {
            //System.out.println("canGetBook() in BookStore is Wrong");
            cgbbs = true;
        }
        bs1.displayItems();
        PrivilegedKid pkbs3 = new PrivilegedKid(200);
        if(!bs1.canGetBook(pkbs3, bs1book2))
        {
            //System.out.println("canGetBook() in BookStore is Wrong");
            cgbbs = true;
        }
        if(bs1.getBooks().length != 1 || bs1.getIncome() != 250 || !bs1.getBooks()[0].equals(bs1book3))
        {
            //System.out.println("canGetBook() in BookStore is Wrong");
            cgbbs = true;
        }
        if(bs1.canGetBook(pkbs3, bs1book2))
        {
            //System.out.println("canGetBook() in BookStore is Wrong");
            cgbbs = true;
        }
        if(cgbbs)
        {
            System.out.println("canGetBook() in BookStore is Wrong");
            done = false;
        }


        BookStore bs2 = new BookStore();
        Book bs2book1 = new Book("bs2book1", 200, "Shanay");
        Book bs2book2 = new Book("bs2book2", 100, "Sehaj");
        Book bs2book3 = new Book("bs2book3", 150, "Joel");
        bs2.addBook(bs2book1);
        bs2.addBook(bs2book2);
        bs2.addBook(bs2book3);
        PrivilegedKid pkbs4 = new PrivilegedKid(500);
        pkbs4.getFromBookStore(bs2, bs2book3);
        boolean gfbspk = true;
        if(bs2.getBooks().length != 2 || bs2.getIncome() != 150 || !bs2.getBooks()[0].equals(bs2book2) || !bs2.getBooks()[1].equals(bs2book1))
        {
            //System.out.println("getFromBookStore() in PrivilegedKid is Wrong");
            gfbspk = false;
        }
        if(pkbs4.getMoney() != 350 || pkbs4.getBooks().length != 1 || !pkbs4.getBooks()[0].equals(bs2book3))
        {
            //System.out.println("getFromBookStore() in PrivilegedKid is Wrong");
            gfbspk = false;
        }
        bs2.displayItems();
        pkbs4.getFromBookStore(bs2, bs2book2);
        if(bs2.getBooks().length != 1 || bs2.getIncome() != 250 || !bs2.getBooks()[0].equals(bs2book1))
        {
            //System.out.println("getFromBookStore() in PrivilegedKid is Wrong");
            gfbspk = false;
        }
        if(pkbs4.getMoney() != 250 || pkbs4.getBooks().length != 2 || !pkbs4.getBooks()[0].equals(bs2book3) || !pkbs4.getBooks()[1].equals(bs2book2))
        {
            //System.out.println("getFromBookStore() in PrivilegedKid is Wrong");
            gfbspk = false;
        }
        pkbs4.getFromBookStore(bs2, bs2book1);
        if(bs2.getBooks().length != 0 || bs2.getIncome() != 450)
        {
            //System.out.println("getFromBookStore() in PrivilegedKid is Wrong");
            gfbspk = false;
        }
        if(pkbs4.getMoney() != 50 || pkbs4.getBooks().length != 3 || !pkbs4.getBooks()[0].equals(bs2book3) || !pkbs4.getBooks()[1].equals(bs2book2) || !pkbs4.getBooks()[2].equals(bs2book1))
        {
            //System.out.println("getFromBookStore() in PrivilegedKid is Wrong");
            gfbspk = false;
        }
        if(!gfbspk)
        {
            System.out.println("getFromBookStore() in PrivilegedKid is Wrong");
            done = false;
        }




        ngo1.displayItems();
        boolean cbgngo = true;
        PrivilegedKid pkngo1 = new PrivilegedKid(500);
        if(ngo1.canGetBook(pkngo1, ngo1book1))
        {
            //System.out.println("canGetBook() in NGO is Wrong");
            cbgngo = false;
        }
        UnderprivilegedKid ukngo1 = new UnderprivilegedKid();
        if(ngo1.canGetBook(ukngo1, book1))
        {
            //System.out.println("canGetBook() in NGO is Wrong");
            cbgngo = false;
        }
        if(!ngo1.canGetBook(ukngo1, ngo1book3))
        {
            //System.out.println("canGetBook() in NGO is Wrong");
            cbgngo = false;
        }
        if(ngo1.getBooks().length != 2 || ngo1.getItemCount() != 2 || !ngo1.getBooks()[0].equals(ngo1book2) || !ngo1.getBooks()[1].equals(ngo1book1))
        {
            //System.out.println("canGetBook() in NGO is Wrong");
            cbgngo = false;
        }
        if(!ngo1.canGetBook(ukngo1, ngo1book1))
        {
            //System.out.println("canGetBook() in NGO is Wrong");
            cbgngo = false;
        }
        if(ngo1.getBooks().length != 1 || ngo1.getItemCount() != 1 || !ngo1.getBooks()[0].equals(ngo1book2))
        {
            //System.out.println("canGetBook() in NGO is Wrong");
            cbgngo = false;
        }
        if(!ngo1.canGetBook(ukngo1, ngo1book2))
        {
            //System.out.println("canGetBook() in NGO is Wrong");
            cbgngo = false;
        }
        if(ngo1.getBooks().length != 0 || ngo1.getItemCount() != 0)
        {
            //System.out.println("canGetBook() in NGO is Wrong");
            cbgngo = false;
        }
        if(ngo1.canGetBook(ukngo1, ngo1book2))
        {
            //System.out.println("canGetBook() in NGO is Wrong");
            cbgngo = false;
        }
        if(!cbgngo)
        {
            System.out.println("canGetBook() in NGO is Wrong");
            done = false;
        }



        NGO ngo4 = new NGO(1000);
        Book ngo4book1 = new Book("ngo4book1", 400, "Vidhi");
        Book ngo4book2 = new Book("ngo4book2", 200, "Sehaj");
        Book ngo4book3 = new Book("ngo4book3", 300, "Ashman");
        ngo4.addBook(ngo4book1);
        ngo4.addBook(ngo4book2);
        ngo4.addBook(ngo4book3);
        ngo4.displayItems();
        PrivilegedKid pkngo4 = new PrivilegedKid(10000);
        pkngo4.getFromNGO(ngo4, ngo4book3);
        if(pkngo4.getBooks().length != 0 || ngo4.getBooks().length != 3)
        {
            System.out.println("getFromNGO() in PrivilegedKid is Wrong");
            done = false;
        }
        



        UnderprivilegedKid upkf = new UnderprivilegedKid();
        BookStore bs3 = new BookStore();
        Book bs3book1 = new Book("bs2book1", 200, "Shanay");
        Book bs3book2 = new Book("bs2book2", 400, "Sehaj");
        Book bs3book3 = new Book("bs2book3", 150, "Joel");
        bs3.addBook(bs3book1);
        bs3.addBook(bs3book2);
        bs3.addBook(bs3book3);
        upkf.getFromBookStore(bs3, bs3book3);
        upkf.getFromBookStore(bs3, bs3book1);
        upkf.getFromBookStore(bs3, bs3book2);
        if(upkf.getBooks().length != 0 || bs3.getBooks().length != 3)
        {
            System.out.println("getFromBookStore() in UnderprivilegedKid is Wrong");
            done = false;
        }

        ngo4.displayItems();
        upkf.getFromNGO(ngo4, ngo4book3);
        boolean gfngoupk = false;
        if(upkf.getBooks().length != 1 || !upkf.getBooks()[0].equals(ngo4book3) || ngo4.getBooks().length != 2 || !ngo4.getBooks()[0].equals(ngo4book2) || !ngo4.getBooks()[1].equals(ngo4book1))
        {
            //System.out.println("getFromNGO() in UnderprivilegedKid is Wrong");
            gfngoupk = true;
        }
        upkf.getFromNGO(ngo4, ngo4book1);
        if(upkf.getBooks().length != 2 || !upkf.getBooks()[0].equals(ngo4book3) || !upkf.getBooks()[1].equals(ngo4book1) || ngo4.getBooks().length != 1 || !ngo4.getBooks()[0].equals(ngo4book2))
        {
            //System.out.println("getFromNGO() in UnderprivilegedKid is Wrong");
            gfngoupk = true;
        }
        upkf.getFromNGO(ngo4, ngo4book2);
        if(upkf.getBooks().length != 3 || !upkf.getBooks()[0].equals(ngo4book3) || !upkf.getBooks()[1].equals(ngo4book1) || !upkf.getBooks()[2].equals(ngo4book2)|| ngo4.getBooks().length != 0)
        {
            //System.out.println("getFromNGO() in UnderprivilegedKid is Wrong");
            gfngoupk = true;
        }
        upkf.getFromNGO(ngo4, ngo4book2);
        if(upkf.getBooks().length != 3 || !upkf.getBooks()[0].equals(ngo4book3) || !upkf.getBooks()[1].equals(ngo4book1) || !upkf.getBooks()[2].equals(ngo4book2)|| ngo4.getBooks().length != 0)
        {
            //System.out.println("getFromNGO() in UnderprivilegedKid is Wrong");
            gfngoupk = true;
        } 

        if(gfngoupk)
        {
            System.out.println("getFromNGO() in UnderprivilegedKid is Wrong");
            done = false;
        }


        if(done)
        {
            System.out.println("\n\nCongratulations on finishing the Lab !!\nHope You Had Fun.\nPlease zip and upload all the files on Quanta and check that you have uploaded the correct files.\n\n");
        }


        
// -------------------------------------------------------------------------------------
    }
}