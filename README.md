# Welcome to the Dev Tools Console!
#
# You can use Console to explore the Elasticsearch API. See the Elasticsearch API reference to learn more:
# https://www.elastic.co/guide/en/elasticsearch/reference/current/rest-apis.html
#
# Here are a few examples to get you started.

PUT product
{
  "settings": {
    "analysis": {
      "filter": {
        "my_edge_ngram_filter": {
          "type": "edge_ngram",
          "min_gram": 1,
          "max_gram": 6
        }
      },
      "analyzer": {
        "my_edge_ngram_analyzer": {
          "type": "custom",
          "tokenizer": "standard",
          "filter": [
            "lowercase",
            "my_edge_ngram_filter"
          ]
        },
        "my_search_analyzer": {
          "type": "custom",
          "tokenizer": "standard",
          "filter": ["lowercase"]
        }
      }
    }
  }
}


PUT product/_mappings
{
    "properties": {
      "name": {
        "type": "text",
        "analyzer": "my_edge_ngram_analyzer",
        "search_analyzer": "my_search_analyzer"
      }
    }
}

PUT product/_doc/7
{
  "id":7,
  "name":"phone",
  "price":60000,
  "qty": 1
}

GET product/_search



GET product/_search
{
  "query": {
    "match": {
      "name": "mo"
    }
  }
}


POST product/_analyze
{
  "field": "name",
  "text": "mo"
}















