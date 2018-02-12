
public class Results {
	
	private int phy, che, mat;
	private float total, pex;
	private int passpex = 60;
	private int failedexams = 0;
		public void ShowResults() {
			total = phy + che + mat;
			pex = total * 100/450;
				if (phy*100/150 <= passpex) {
					failedexams = failedexams +1;
					}
				if (che*100/150 <= passpex) {
					failedexams = failedexams +1;
					}
				if (mat*100/150 <= passpex) {
					failedexams = failedexams +1;
					}
				if (failedexams == 0) {
					System.out.println("Marks: " +total);
					System.out.println("Percentage: " +pex);
					}
				if (failedexams == 1) {
					System.out.println("Retake the exam.");
					}
				if (failedexams == 2) {
					System.out.println("Repeat the course.");
					}
				if (failedexams == 3) {
					System.out.println("Go home.");
					}
			
		}
public void Physics(int A) {
	if (A>=0 && A<=150) {
		phy = A;
	} else {
		System.out.println("Invalid Physics input.");
	}
}
public void Chemistry(int B) {
	if (B>=0 && B<=150) {
		che = B;
	} else {
		System.out.println("Invalid Chemistry input.");
	}
}
public void Maths(int C) {
	if (C>=0 && C<=150) {
		mat = C;
	} else {
		System.out.println("Invalid Maths input.");
	}
}
}
