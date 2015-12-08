(function() {
  $(function() {
    var ctx, data, myLineChart, options;
    Chart.defaults.global.responsive = true;
    ctx = $('#line-chart').get(0).getContext('2d');
    options = {
      scaleShowGridLines: true,
      scaleGridLineColor: "rgba(0,0,0,.05)",
      scaleGridLineWidth: 1,
      scaleShowHorizontalLines: true,
      scaleShowVerticalLines: true,
      bezierCurve: false,
      bezierCurveTension: 0.4,
      pointDot: true,
      pointDotRadius: 4,
      pointDotStrokeWidth: 1,
      pointHitDetectionRadius: 20,
      datasetStroke: true,
      datasetStrokeWidth: 2,
      datasetFill: true,
      legendTemplate: "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].strokeColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
    };
    data = {
      labels: ['1º Bim', '2º Bim', '3º Bim', '4º Bim'],
      datasets: [
        {
          label: "1º Ano",
          fillColor: "rgba(26, 188, 156,0.2)",
          strokeColor: "#1ABC9C",
          pointColor: "#1ABC9C",
          pointStrokeColor: "#fff",
          pointHighlightFill: "#fff",
          pointHighlightStroke: "#1ABC9C",
          data: [65, 59, 80, 81]
        }, {
          label: "2º Ano",
          fillColor: "rgba(34, 167, 240,0.2)",
          strokeColor: "#22A7F0",
          pointColor: "#22A7F0",
          pointStrokeColor: "#fff",
          pointHighlightFill: "#fff",
          pointHighlightStroke: "#22A7F0",
          data: [28, 48, 40, 19]
        }, {
          label: "3º Ano",
          fillColor: "rgba(82, 47, 240,0.2)",
          strokeColor: "#8247F0",
          pointColor: "#8247F0",
          pointStrokeColor: "#fff",
          pointHighlightFill: "#fff",
          pointHighlightStroke: "#8247F0",
          data: [12, 23, 65, 72]
        }
      ]
    };
    myLineChart = new Chart(ctx).Line(data, options);
  });

}).call(this);
