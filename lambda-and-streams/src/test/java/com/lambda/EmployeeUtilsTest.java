package com.lambda;

import com.lambda.Employee;
import com.lambda.EmployeeUtils;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeUtilsTest {

	private EmployeeUtils employeeUtils = new EmployeeUtils();

	@Test
	public void employeeFullName() {
		Employee employee = new Employee();
		employee.setFirstName("Jose");
		employee.setLastName("Barreto");

		String actual = employeeUtils.getFullName(employee);

		Assert.assertEquals(actual,"Jose Barreto");
	}

	@Test
	public void employeeManagersLastName() {
		Employee employee = new Employee();
		employee.setFirstName("Jose");
		employee.setLastName("Barreto");
		Employee manager = new Employee();
		manager.setFirstName("Alfred");
		manager.setLastName("Wayne");
		employee.setManager(manager);

		String actual = employeeUtils.getManagersLastName(employee);

		Assert.assertEquals(actual,"Wayne");
	}

	@Test
	public void employeeHasBeenEmployedLongerThanFiveYears() {
		Employee employee = new Employee();
		employee.setFirstName("Jose");
		employee.setLastName("Barreto");
		employee.setYearsOfService(10);

		boolean actual = employeeUtils.hasBeenEmployedLongerThanFiveYears(employee);
		Assert.assertTrue(actual);
	}

	@Test
	public void employeeHasMoreThanThreeDirectReports() {
		Employee employee = new Employee();
		employee.setFirstName("Jose");
		employee.setLastName("Barreto");
		employee.setYearsOfService(10);
		employee.setNumberOfDirectReports(4);

		boolean actual = employeeUtils.hasMoreThanThreeDirectReports(employee);
		Assert.assertTrue(actual);
	}
	@Test
	public void employeeHasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports() {
		Employee employee = new Employee();
		employee.setYearsOfService(10);
		employee.setNumberOfDirectReports(1);

		boolean actual = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);
		Assert.assertTrue(actual);
	}


}
