package com.hpn.scalajs.chartkickk

import org.scalajs.dom.Element
import scalajs.js

object Chartkick extends js.Object {
  def LineChart(element: Element, dataSource: js.Object, options: js.Object = new js.Object): Unit = ???
  def PieChart(element: Element, dataSource: js.Object, options: js.Object = new js.Object): Unit = ???
  def ColumnChart(element: Element, dataSource: js.Object, options: js.Object = new js.Object): Unit = ???
  def BarChart(element: Element, dataSource: js.Object, options: js.Object = new js.Object): Unit = ???
  def AreaChart(element: Element, dataSource: js.Object, options: js.Object = new js.Object): Unit = ???
  def GeoChart(element: Element, dataSource: js.Object, options: js.Object = new js.Object): Unit = ???
  def Timeline(element: Element, dataSource: js.Object, options: js.Object = new js.Object): Unit = ???
  val charts: Map[String, js.Object] = ???
}
