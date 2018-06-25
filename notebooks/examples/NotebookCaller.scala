// Databricks notebook source
dbutils.notebook.run("./NotebookParam", 30, Map("foo" -> "Scala Code"))

// COMMAND ----------

// MAGIC %py
// MAGIC dbutils.notebook.run("NotebookParam", 60, {"foo": "Python Code"})

// COMMAND ----------

// MAGIC %run ./NotebookParam $foo="Databricks Run"