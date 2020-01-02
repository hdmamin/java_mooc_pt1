public class Reformatory {
    private int timesMeasured;
    
    public Reformatory() {
        this.timesMeasured = 0;
    }
    
    public int weight(Person person) {
        // return the weight of the person
        this.timesMeasured++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured() {
        return this.timesMeasured;
    }
}
