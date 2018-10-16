package com.panibrat.graph._399;

/*
399. Evaluate Division

Equations are given in the format A / B = k, where A and B are variables represented as strings, and k is a real number (floating point number). Given some queries, return the answers. If the answer does not exist, return -1.0.

Example:
Given a / b = 2.0, b / c = 3.0.
queries are: a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ? .
return [6.0, 0.5, -1.0, 1.0, -1.0 ].

The input is: vector<pair<string, string>> equations, vector<double>& values, vector<pair<string, string>> queries , where equations.size() == values.size(), and the values are positive. This represents the equations. Return vector<double>.

According to the example above:

equations = [ ["a", "b"], ["b", "c"] ],
values = [2.0, 3.0],
queries = [ ["a", "c"], ["b", "a"], ["a", "e"], ["a", "a"], ["x", "x"] ].

The input is always valid. You may assume that evaluating the queries will result in no division by zero and there is no contradiction.
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
  public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
    UnionFind uf = new UnionFind(equations, values);

    double[] result = new double[queries.length];
    int i = 0;
    for (String[] query : queries) {
      Variable v1 = uf.find(query[0]);
      Variable v2 = uf.find(query[1]);
      if (v1 != null && v2 != null && v1.parent.equals(v2.parent)) {
        result[i] = v2.ratio / v1.ratio;
      } else {
        result[i] = -1.0;
      }
      i++;
    }
    return result;
  }

  class UnionFind {
    private Map<String, Variable> map = new HashMap<>();

    UnionFind(String[][] equations, double[] values) {
      int i = 0;
      for (String[] pair : equations) {
        add(pair[0]);
        add(pair[1]);
        union(pair[0], pair[1], values[i++]);
      }
    }

    void add(String s) {
      map.putIfAbsent(s, new Variable(s, 1.0));
    }

    Variable find(String s) {
      Variable variable = map.get(s);
      if (variable != null && !variable.parent.equals(s)) {
        Variable parent = find(variable.parent);
        variable.parent = parent.parent;
        variable.ratio = variable.ratio * parent.ratio;
      }
      return variable;
    }

    void union(String s1, String s2, Double ratio) {
      Variable p1 = find(s1);
      Variable p2 = find(s2);
      if (!p1.parent.equals(p2.parent)) {
        String parent = p2.parent;
        p2.parent = p1.parent;
        p2.ratio = p1.ratio * ratio / p2.ratio;
        map.put(parent, p2);
      }
    }

  }

  class Variable {
    String parent;
    Double ratio;

    Variable(String parent, Double ratio) {
      this.parent = parent;
      this.ratio = ratio;
    }
  }

}