package inquiry;

import inquiry.Counter.ConditionType;

public class Manager {
	private static final int CNUM = 5;
	Counter[] counterList;

	Manager() {
		counterList = new Counter[CNUM];
		for (int i = 0; i < CNUM; i++) {
			counterList[i] = new Counter(i + 1);
		}
	}

	void setCounter(String name) {
		int i = 0;
		System.out.print("(応対開始)");
		while(i < CNUM) {
			if (counterList[i].getConditions() == ConditionType.OPEN) {
				counterList[i].set(name);
				System.out.print("No." + counterList[i].getNo() + ":");
				System.out.println(name + "さん");
				return;
			}
			i++;
		}
		System.out.print("応答開始できません。");
	}

	void freeCounter(int no) {
		System.out.print("(No." + counterList[no - 1].getNo() + "終了)");
		if (counterList[no - 1].getConditions() != ConditionType.BUSY) {
			System.out.println("対応していません。");
			return;
		}
		counterList[no - 1].free();
	}
}