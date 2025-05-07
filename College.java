class College implements EducationalUnit {
    private String name;
    private List<EducationalUnit> units = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void addUnit(EducationalUnit unit) {
        units.add(unit);
    }

    public void removeUnit(EducationalUnit unit) {
        units.remove(unit);
    }

    @Override
    public void displayDetails() {
        System.out.println("College: " + name);
        for (EducationalUnit unit : units) {
            unit.displayDetails();
        }
    }

    @Override
    public int getStudentCount() {
        int count = 0;
        for (EducationalUnit unit : units) {
            count += unit.getStudentCount();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (EducationalUnit unit : units) {
            total += unit.getBudget();
        }
        return total;
    }
}
