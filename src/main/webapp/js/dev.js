require(['jquery', 'mustache'], function($, Mustache) {

  var partials = {
    '_person': $.ajax({
      url: '_person.html',
      async: false
    }).responseText
  };

  if ($('html').hasClass('{{no-server}}')) {

    // TODO: optionally provide an offline mode...
  }

});
