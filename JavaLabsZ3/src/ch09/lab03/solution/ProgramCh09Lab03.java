package ch09.lab03.solution;

import java.util.ArrayList;
/*
 *  �s�gProgramCh09Lab03.java�A�ӫe�D�A���ArrayList 
 *  ����v�A�Шϥ�5.0���W�j��for()�ӥ[�`����v�����A
 *  �Ҧ��ƭȩʪ���� 
 */
public class ProgramCh09Lab03 {
	public static void main(String[] args) {
		ArrayList  v = new ArrayList();
		v.add(new Integer(10000));
		v.add(3.14);
		v.add(new Long(21L));
		v.add(new Short("100"));
		v.add(new Double(5.1));
		v.add("Kitty");
		v.add(200);
		v.add(new Object());
		double total = 0 ; 
		for(Object o: v){
			if ( o instanceof Number) {
				Number num = (Number) o ;
				total += num.doubleValue();
			}
		}
		System.out.println("�`�M��:" + total);
	}
}