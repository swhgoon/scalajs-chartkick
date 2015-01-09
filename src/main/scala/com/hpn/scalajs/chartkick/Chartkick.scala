package com.hpn.scalajs.chartkick

import org.scalajs.dom.Element
import scalajs.js

object Chartkick extends js.Object {
  def charts: js.Dictionary[Chart] = ???
}

abstract class Chart(val element: Element, val dataSource: js.Object, val options: js.Object) extends js.Object

import scalajs.js.annotation.JSName

@JSName("Chartkick.LineChart")
class LineChart(element: Element, dataSource: js.Object, options: js.Object = new js.Object) extends Chart(element, dataSource, options)

@JSName("Chartkick.PieChart")
class PieChart(element: Element, dataSource: js.Object, options: js.Object = new js.Object) extends Chart(element, dataSource, options)

@JSName("Chartkick.ColumnChart")
class ColumnChart(element: Element, dataSource: js.Object, options: js.Object = new js.Object) extends Chart(element, dataSource, options)

@JSName("Chartkick.BarChart")
class BarChart(element: Element, dataSource: js.Object, options: js.Object = new js.Object) extends Chart(element, dataSource, options)

@JSName("Chartkick.AreaChart")
class AreaChart(element: Element, dataSource: js.Object, options: js.Object = new js.Object) extends Chart(element, dataSource, options)

@JSName("Chartkick.GeoChart")
class GeoChart(element: Element, dataSource: js.Object, options: js.Object = new js.Object) extends Chart(element, dataSource, options)

@JSName("Chartkick.Timeline")
class Timeline(element: Element, dataSource: js.Object, options: js.Object = new js.Object) extends Chart(element, dataSource, options)

/*
    val chart1 = new chartkick.LineChart(dom.document.getElementById("chart-1"), {
      val datas = Seq(
        ChartData("2013-02-10 00:00:00 -0800", 11),
        ChartData("2013-02-11 00:00:00 -0800", 6),
        ChartData("2013-02-12 00:00:00 -0800", 3),
        ChartData("2013-02-13 00:00:00 -0800", 2)
      )
      val dataSource = js.Dynamic.literal()
      datas.foreach(x => dataSource.updateDynamic(x.date)(x.value))
      dataSource
    })

    val chart2 = new chartkick.PieChart(dom.document.getElementById("chart-2"), {
      val datas = Seq(
        ChartData("Blueberry", 44),
        ChartData("Strawberry", 23)
      )
      // val dataSource = new js.Array[js.Array[Any]]()
      // datas.foreach(x => dataSource.push(js.Array(x.date, x.value)))
      val dataSource = js.Array[js.Array[Any]](datas.map(x => js.Array(x.date, x.value)): _*)
      dataSource
    })

    val charts = chartkick.Chartkick.charts
    val c1 = charts.get("chart-1")
    val c2 = charts.get("chart-2")
    console.log(charts)
    console.log(c1)
    console.log(c2)
    console.log(c1 == chart1)
    console.log(c2 == chart2)
    console.log(c1 == c2)
*/
