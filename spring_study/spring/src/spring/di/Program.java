package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Exam exam = new NewlecExam(); 
		 * ExamConsole console = new InlineExamConsole();
		 * console.setExam(exam);
		 */
		
		  ApplicationContext context = new
				  AnnotationConfigApplicationContext(NewLecDiConfig.class);
		  		  //ClassPathXmlApplicationContext("spring/di/setting.xml");
		  
		/*
		 * Exam exam = context.getBean(Exam.class); System.out.println(exam.toString());
		 */
		
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
	}

}
