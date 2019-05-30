package SwipeMachine;

/**
 *
 * @author Thomas Goodman
 */
public class Person implements Comparable<Person> {

    private String firstName, lastName, rank, serviceNo;

    public Person() {
        this("-", "-", "-", "-");
    }

    public Person(String serviceNo) {
        this(serviceNo, "-", "-", "-");
    }

    public Person(String serviceNo, String rank) {
        this(serviceNo, rank, "-", "-");
    }

    public Person(String serviceNo, String rank, String lastName) {
        this(serviceNo, rank, lastName, "-");
    }

    public Person(String serviceNo, String rank, String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName.toUpperCase();
        this.rank = rank;
        this.serviceNo = serviceNo;
    }

    public void setFirstName(String name) {
        firstName = name;
    }

    public void setLastName(String name) {
        lastName = name;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRank() {
        return rank;
    }

    public String getServiceNo() {
        return serviceNo;
    }

    @Override
    public String toString() {
        String output = getServiceNo() + " \t" + getRank() + " \t" + getLastName() + " \t" + getFirstName();
        return output;
    }

    @Override
    public int compareTo(Person otherPerson) {

        if (rank.compareToIgnoreCase(otherPerson.rank) < 0) {
            return -1;
        } else if (rank.compareToIgnoreCase(otherPerson.rank) == 0) {
            if (lastName.compareToIgnoreCase(otherPerson.lastName) < 0) {
                return -1;
            } else if (lastName.compareToIgnoreCase(otherPerson.lastName) == 0) {
                if (firstName.compareToIgnoreCase(otherPerson.firstName) < 0) {
                    return -1;
                } else if (firstName.compareToIgnoreCase(otherPerson.firstName) == 0) {
                    if (serviceNo.compareToIgnoreCase(otherPerson.serviceNo) < 0) {
                        return -1;
                    }
                }
            }
        }

        return 1;

//        switch (this.firstName.compareToIgnoreCase(otherPerson.firstName)) {
//            case -1: {
//                return -1;
//            }
//            case 0: {
//                switch (this.lastName.compareToIgnoreCase(otherPerson.lastName)) {
//                    case -1: {
//                        return -1;
//                    }
//                    case 0: {
//                        if (this.serviceNo.compareToIgnoreCase(otherPerson.serviceNo) < 0) {
//                            return -1;
//                        }
//                    }
//                }
//            }
//        }
//        return 1;
    }
}

