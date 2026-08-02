package OOPS_01_Basics.OOPS_01_object;

class Database {

    private static Database obj = new Database();

    private Database() {

    }

    public static Database getInstance() {
        return obj;
    }
}
