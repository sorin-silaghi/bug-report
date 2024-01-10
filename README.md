The test BugReportTest.java fails even though it should run successfully.

If I add the dependency `netty-incubator-codec-http3` to compileOnly, the test succeeds.

There is no indication in the logs why the test fails at all. The cause is that the annotation processor
needs that dependency since the class NettyClientSslBuilder uses it.