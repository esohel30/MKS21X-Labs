import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int initialcap) {
    super(initialcap);
  }

  @Override
  public T set(int index, T val) {
    if (val == null) {
      throw new IllegalArgumentException();
    } else {super.set(index, val);}
    return val;
  }
