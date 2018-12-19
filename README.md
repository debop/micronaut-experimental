# micronaut-experimental

## 주의사항 

Micronaut 를 사용하기 위해서는 다음을 주의해야 한다.

* shadowJar 를 수행해야 하는데, 현재 gradle 4.x 버전까지 지원하고, 5.0 이상은 지원하지 않는다. 
* dependencies 에서 implementation 을 사용하면 안되고, compile 을 사용해야 한다. 