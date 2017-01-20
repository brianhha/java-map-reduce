import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Writable;

public class DoublePair implements Writable {
    double first;
    double second;

    public DoublePair() {
	first = 0;
	second = 0;
    }

    public DoublePair(double double1, double double2) {
	first = double1;
	second = double2;
    }
	
	public static void main(String[] args) {
	}

    public double getDouble1() {
	return first;
    }

    public double getDouble2() {
        return second;
    }

    public void setDouble1(double val) {
	first = val;
    }

    public void setDouble2(double val) {
	second = val;
    }

    public void write(DataOutput out) throws IOException {
	out.writeDouble(first);
	out.writeDouble(second);
    }

    public void readFields(DataInput in) throws IOException {
	first = in.readDouble();
	second = in.readDouble();
    }
}
