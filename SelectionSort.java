public class SelectionSort {

    public static void main(String[] args) {
        // Create an array of employees to be sorted
        Employee[] employees = {
            new Employee("Jason Smith", 35),
            new Employee("Ray Perkins", 28),
            new Employee("Will Hans", 42),
            new Employee("Tina Campbell", 31),
            new Employee("Bill Wayne", 29)
        };

        // Perform selection sort on the employee array
        performSelectionSort(employees);

        // Print the sorted employee array
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static <T extends Comparable<T>> void performSelectionSort(T[] arr) {
        int n = arr.length;
    
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
    
            for (int j = i + 1; j < n; j++) {
                // Compare the elements using the compareTo method
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
    
            // Swap the elements
            T temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

class Employee implements Comparable<Employee> {
    private String fullName;
    private int yearsOfService;

    public Employee(String fullName, int yearsOfService) {
        this.fullName = fullName;
        this.yearsOfService = yearsOfService;
    }

    @Override
    public int compareTo(Employee other) {
        // Compare based on years of service
        return Integer.compare(this.yearsOfService, other.yearsOfService);
    }

    @Override
    public String toString() {
        return fullName + " (" + yearsOfService + " years of service)";
    }
}
