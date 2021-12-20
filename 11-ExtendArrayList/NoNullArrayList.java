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
