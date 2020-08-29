package inquiry;

public class Counter {

	public enum ConditionType {
		BUSY,
		OPEN
	};

	int no;
	ConditionType conditions;
	String name;

	Counter(int num) {
		this.no = num;
		conditions = ConditionType.OPEN;
	}

	void set(String name) {
		this.name = name;
		conditions = ConditionType.BUSY;
	}

	void free() {
		conditions = ConditionType.OPEN;
	}

	int getNo() {
		return no;
	}

	String getName() {
		return name;
	}

	ConditionType getConditions() {
		return conditions;
	}
}