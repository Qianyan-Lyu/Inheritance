public class StoreOneA extends StoreToRent {

    public void showStoreInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "This is child class toString()";
    }
}