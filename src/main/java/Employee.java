/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /**
     * name of employee.
     */
    private String name;
    /**
     * String for manager.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param name0 name of employee.
     * @param manager0 name of manager.
     */
    public Employee(final String name0, final String manager0) {
        this.name = name0;
        this.manager = manager0;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param name0 name of employee.
     */
    public void setName(final String name0) {
        this.name = name0;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param manager0 name of manager.
     */
    public void setManager(final String manager0) {
        this.manager = manager0;
    }
}
