// Databricks notebook source
dbutils.notebook.run("./NotebookParam", 30, Map("foo" -> "myScalaValue"))

// COMMAND ----------

// MAGIC %py
// MAGIC dbutils.notebook.run("NotebookParam", 60, {"foo": "MyPyValue"})

// COMMAND ----------

// MAGIC %run ./NotebookParam $foo="MyRunValue"