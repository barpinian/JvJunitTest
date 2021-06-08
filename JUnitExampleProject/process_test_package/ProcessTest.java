/**
 * 
 */
package process_test_package;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import Process.ProcessRun;





/**
 * @author Itai
 *
 */
class ProcessTest {

	public static ProcessRun process = new ProcessRun(); //member to all function
	public static String output;
	public static String[] command = {"C:\\temp\\CshConsoleAPI\\bin\\Debug\\CshConsoleAPI.exe",""};
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		process.Run(command);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		output = process.Exit();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}


	/***
	 * Test the stack trace pring is working.
	 */
/*	@Test
	void testTrace() {	
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String trace1 = sw.toString();
			System.out.print(trace1);
			
			Assert.assertTrue(!trace1.isEmpty());
		}
	}*/


	/***
	 * Test operating system command line.
	 * Run command line sub process.
	 */	
	/*@Test
	void testCmdDir() {
		ProcessRun process = new ProcessRun();
		
		try {
			String[] dir_rist = {"dir", "c:\\"};
			process.Execute(dir_rist);
			process = null;
		} catch (Exception e) {
			fail("Unable to run dir");
		}
		return;
	}*/
	
	
	/***
	 * Test the console application runs.
	 */
	/*@Test
	void testConsole() {
		String output = "";
		ProcessRun process = new ProcessRun();
		String[] command = {"C:\\temp\\CshConsoleAPI\\bin\\Debug\\CshConsoleAPI.exe",""};
		try {
			output = process.Run(command);
			System.out.println(output);
						
			output = process.Exit();			
		}
		catch (Exception e) {
			//	In case of exception.
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			//	Read the trace information.
			e.printStackTrace(pw);
			String trace = sw.toString();
			
			//	Write the trace to console and fail the test.
			System.out.print(trace);
			Assert.assertTrue(!trace.isEmpty());
		}
		return;
	}*/

	
	/***
	 * Test the console application runs 
	 * and execute command-line echo command.
	 */
	@Test
	void testEchoCommand() {
		String output = "";
		//ProcessRun process = new ProcessRun();
		String[] command = {"C:\\_SourceDev.Test\\WsCppConsoleAPI\\CppConsoleAPI\\Debug\\CppConsoleAPI.exe",""};
		try {
			output = process.Run(command);
			Assert.assertTrue(output.contentEquals("\r\n>"));
			
			output = process.Command("echo(Hello world)\n");
			Assert.assertTrue(output.contentEquals("Hello world\r\n>"));

			output = process.Command("echo(Hello world)\n");
			Assert.assertTrue(output.contentEquals("Hello world\r\n>"));

			//output = process.Exit();			
		}
		catch (Exception e) {
			//	In case of exception.
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			//	Read the trace information.
			e.printStackTrace(pw);
			String trace = sw.toString();
			
			//	Write the trace to console and fail the test.
			System.out.print(trace);
			Assert.assertTrue(!trace.isEmpty());
		}
		return;
	}
	
	@Test
	void testAddCommand() {
		String output = "";
		//ProcessRun process = new ProcessRun();
		String[] command = {"C:\\_SourceDev.Test\\WsCppConsoleAPI\\CppConsoleAPI\\Debug\\CppConsoleAPI.exe",""};
		try {
			output = process.Run(command);
			Assert.assertTrue(output.contentEquals("\r\n>"));
			
			output = process.Command("add(5,3)\n");
			Assert.assertTrue(output.contentEquals("8\r\n>"));

			output = process.Command("add(8,2)\n");
			Assert.assertTrue(output.contentEquals("10\r\n>"));

			//output = process.Exit();			
		}
		catch (Exception e) {
			//	In case of exception.
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			//	Read the trace information.
			e.printStackTrace(pw);
			String trace = sw.toString();
			
			//	Write the trace to console and fail the test.
			System.out.print(trace);
			Assert.assertTrue(!trace.isEmpty());
		}
		return;
	}
	
	@Test
	void testSubCommand() {
		String output = "";
		//ProcessRun process = new ProcessRun();
		String[] command = {"C:\\_SourceDev.Test\\WsCppConsoleAPI\\CppConsoleAPI\\Debug\\CppConsoleAPI.exe",""};
		try {
			output = process.Run(command);
			Assert.assertTrue(output.contentEquals("\r\n>"));
			
			output = process.Command("sub(5,5)\n");
			Assert.assertTrue(output.contentEquals("0\r\n>"));

			output = process.Command("sub(10,5)\n");
			Assert.assertTrue(output.contentEquals("5\r\n>"));

			//output = process.Exit();			
		}
		catch (Exception e) {
			//	In case of exception.
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			//	Read the trace information.
			e.printStackTrace(pw);
			String trace = sw.toString();
			
			//	Write the trace to console and fail the test.
			System.out.print(trace);
			Assert.assertTrue(!trace.isEmpty());
		}
		return;
	}
	
	@Test
	void testMultCommand() {
		String output = "";
		//ProcessRun process = new ProcessRun();
		String[] command = {"C:\\_SourceDev.Test\\WsCppConsoleAPI\\CppConsoleAPI\\Debug\\CppConsoleAPI.exe",""};
		try {
			output = process.Run(command);
			Assert.assertTrue(output.contentEquals("\r\n>"));
			
			output = process.Command("mult(2,2)\n");
			Assert.assertTrue(output.contentEquals("4\r\n>"));

			output = process.Command("mult(4,2)\n");
			Assert.assertTrue(output.contentEquals("8\r\n>"));

			//output = process.Exit();			
		}
		catch (Exception e) {
			//	In case of exception.
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			//	Read the trace information.
			e.printStackTrace(pw);
			String trace = sw.toString();
			
			//	Write the trace to console and fail the test.
			System.out.print(trace);
			Assert.assertTrue(!trace.isEmpty());
		}
		return;
	}
	
	@Test
	void testDivCommand() {
		String output = "";
		//ProcessRun process = new ProcessRun();
		String[] command = {"C:\\_SourceDev.Test\\WsCppConsoleAPI\\CppConsoleAPI\\Debug\\CppConsoleAPI.exe",""};
		try {
			output = process.Run(command);
			Assert.assertTrue(output.contentEquals("\r\n>"));
			
			output = process.Command("div(10,2)\n");
			Assert.assertTrue(output.contentEquals("5\r\n>"));

			output = process.Command("div(10,5)\n");
			Assert.assertTrue(output.contentEquals("2\r\n>"));

			//output = process.Exit();			
		}
		catch (Exception e) {
			//	In case of exception.
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			//	Read the trace information.
			e.printStackTrace(pw);
			String trace = sw.toString();
			
			//	Write the trace to console and fail the test.
			System.out.print(trace);
			Assert.assertTrue(!trace.isEmpty());
		}
		return;
	}
	
	

}
