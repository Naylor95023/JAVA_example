package ch08.lab01.solution;
/*
����{��ProgramCh08Lab01.java�ɷ|�����A���ͨҥ~(java.lang.ArithmeticException)�C
�Х[�J�A���� try-catch �϶��Ϩ�b�o�ͨҥ~���p�ɡA�����ܤU�C�T���G
    �y���氣�k�ɡA���Ͱ��Ƭ��s���ҥ~�z
�t�~�A�n�[�Wfinally�϶��A���϶��|��ܤU�C�T���G
    �y�o�Ofinally�϶��z
�N�����令����ơA�A���楻�{���A�[�����᪺���G�C
 */
public class ProgramCh08Lab01 {
	static void subroutine() {
		try {
			int d = 0;
			int a = 42 / d;
			System.out.println("a=" + a);
		} catch (ArithmeticException e) {
			System.out.println("�����氣�k�ɡA�Y���Ƭ��s�|���� java.lang.ArithmeticException");
		}
	}

	public static void main(String args[]) {
		subroutine();
	}
}