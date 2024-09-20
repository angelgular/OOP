public class Dog {
    public static void main(String[] args) {
        String name;
        boolean isMale;
        int NumberofPuppies;
        Dog[] ListofPuppies;
    }

    public int addPuppies( Dog dogs){
    ListofPuppies[NumberofPuppies] = dogs;
    return NumberofPuppies++;
    }
    public void setName(String names) {
        name = names; 
    }
   
    public String showName() {
        System.out.println("The dog's name is: " + name);
        return name;
    }

    public void setNumberofPuppies(int x){
        ListofPuppies = new Dog[x];
    }
    public void bark() {
        System.out.println("WOFF!, WOFF!");
    }
    public void showNumberofPuppies(){
        System.out.println(NumberofPuppies);
    }
    public void showPuppies() {
        System.out.println("The dog's puppies are:");
        for (String puppy : puppies) {
            System.out.println(puppy);
        }
    }

}
