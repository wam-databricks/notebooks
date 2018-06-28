// Databricks notebook source
dbutils.notebook.run("./NotebookParam", 30, Map("foo" -> "My Scala Code"))

// COMMAND ----------

// MAGIC %py
// MAGIC dbutils.notebook.run("NotebookParam", 60, {"foo": "My Python Code"})

// COMMAND ----------

// MAGIC %run ./NotebookParam $foo="Databricks Run"