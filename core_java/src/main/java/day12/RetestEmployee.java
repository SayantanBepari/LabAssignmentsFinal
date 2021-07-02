package day12;

public class RetestEmployee {
		private String eName;
		private String eGender;
		private String eDept;
		private double eAge;
		public RetestEmployee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public RetestEmployee(String eName, String eGender, String eDept, double eAge) {
			super();
			this.eName = eName;
			this.eGender = eGender;
			this.eDept = eDept;
			this.eAge = eAge;
		}
		public String geteName() {
			return eName;
		}
		public void seteName(String eName) {
			this.eName = eName;
		}
		public String geteGender() {
			return eGender;
		}
		public void seteGender(String eGender) {
			this.eGender = eGender;
		}
		public String geteDept() {
			return eDept;
		}
		public void seteDept(String eDept) {
			this.eDept = eDept;
		}
		public double geteAge() {
			return eAge;
		}
		public void seteAge(double eAge) {
			this.eAge = eAge;
		}
		@Override
		public String toString() {
			return "Employee [eName=" + eName + ", eGender=" + eGender + ", eDept=" + eDept + ", eAge=" + eAge + "]";
		}

		
		
}
