package typesOfVariable;

public class HR {

	public static void main(String[] args) {
		
		Employee virat=new Employee() ;//created object of employee class
		
		virat.emp_name="virat kohali";
		virat.emp_id=18;
		virat.emp_sal=70000.77f;
		virat.emp_desg="QA";
		virat.emp_gender='m';
		
		
		virat.emp_imfo();//calling
		
		Employee yuvraj=new Employee();//created object of employee class
				
		yuvraj.emp_name="yuvaraj singh";
		yuvraj.emp_id=19;
		yuvraj.emp_sal=444444.332f;
		yuvraj.emp_desg="QC";
		yuvraj.emp_gender='m';
		
		yuvraj.emp_imfo();//calling
		
		
		Employee dhoni=new Employee();
		
		
		dhoni.emp_name="mahendra singh ";
		dhoni.emp_id=07;
		dhoni.emp_sal=444444.332f;
		dhoni.emp_desg="capton";
		dhoni.emp_gender='m';
		
		dhoni.emp_imfo();//calling

	}

}
