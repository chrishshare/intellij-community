def <T extends List<? extends X1>> void foo(List<T> a, T b) {
  a.add(b)
}

interface X1{}
class A implements X1{}
class B implements X1{}

void m(A a, B b) {
  foo([[a]], [a])
  foo([[b]], [b])
}