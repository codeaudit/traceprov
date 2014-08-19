TraceProv API
====

Java interface for provenance management. 

**Project status**: developing [milestone 1.0](https://github.com/opendatatrentino/traceprov/issues?milestone=1&state=open)

**Roadmap**: see [project issues](https://github.com/opendatatrentino/traceprov/issues)


#### Usage - snapshots

WARNING: THIS IS A DEVELOPMENT VERSION THAT CAN CHANGE AT ANY TIME, DO NOT USE IT IN PRODUCTION

To use snapshots version in Maven, add this to your pom.xml:

```
  <repositories>
    <repository>
        <id>sonatype-nexus-snapshots</id>
        <name>project</name>
        <url>https://oss.sonatype.org/content/repositories/snapshots/</url>            
    </repository>        
</repositories>
```

in the _dependencies_ section, add:

```        
    <dependency>
      <groupId>eu.trentorise.opendata</groupId>
      <artifactId>traceprov</artifactId>
      <version>0.X.0-SNAPSHOT</version>
    </dependency>
```
where X is the current version


#### Versioning

1) For 0.MINOR.PATCH series, we will increase the MINOR at each change to the api, no matter how small it is.  If we only change the javadoc without changing the api we increase the PATCH.

2) When we reach 1.0.0 we will follow semver.org rules:

Given a version number MAJOR.MINOR.PATCH, increment the:

    MAJOR version when you make incompatible API changes,
    MINOR version when you add functionality in a backwards-compatible manner, and
    PATCH version when you make backwards-compatible bug fixes.

Additional labels for pre-release and build metadata are available as extensions to the MAJOR.MINOR.PATCH format.


#### Projects using this API

* [Jackan](https://github.com/opendatatrentino/Jackan): client for accessing opendata catalogs
* [OpenDataRise](https://github.com/opendatatrentino/OpenDataRise): power tool to cleanse and semantify open data, based on Refine


#### Credits:

* Moaz Reyad - DISI at University of Trento - moaz.reyad@unitn.it
* David Leoni - Trento Rise - david.leoni@unitn.it
* Ivan Tankoyeu - DISI at University of Trento - tankoyeu@disi.unitn.it
