/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package io.debezium.testing.openshift.sqlserver;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

import io.debezium.testing.openshift.OcpConnectorTest;
import io.debezium.testing.openshift.fixtures.connectors.SqlServerConnector;
import io.debezium.testing.openshift.fixtures.databases.OcpSqlServer;
import io.debezium.testing.openshift.fixtures.kafka.OcpKafka;
import io.debezium.testing.openshift.tools.databases.SqlDatabaseController;

/**
 * @author Jakub Cechacek
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Tag("acceptance")
@Tag("sqlserver")
@Tag("openshift")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OcpSqlServerConnectorIT
        extends OcpConnectorTest<SqlDatabaseController>
        implements OcpKafka, OcpSqlServer, SqlServerConnector, SqlServerTestCases {
}