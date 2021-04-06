package Collections;

import java.util.Objects;

public class MethodEquelsHashmap {

    int keyInArray;
    int valueInArray;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MethodEquelsHashmap that = (MethodEquelsHashmap) o;
        return keyInArray == that.keyInArray && valueInArray == that.valueInArray;
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyInArray, valueInArray);
    }

    public int getKeyInArray() {
        return keyInArray;
    }

    public void setKeyInArray(int keyInArray) {
        this.keyInArray = keyInArray;
    }

    public int getValueInArray() {
        return valueInArray;
    }

    public void setValueInArray(int valueInArray) {
        this.valueInArray = valueInArray;
    }
}
